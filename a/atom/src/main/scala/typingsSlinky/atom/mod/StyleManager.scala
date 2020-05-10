package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleManager extends js.Object {
  // Reading Style Elements
  /** Get all loaded style elements. */
  def getStyleElements(): js.Array[HTMLStyleElement] = js.native
  // Paths
  /** Get the path of the user style sheet in ~/.atom. */
  def getUserStyleSheetPath(): String = js.native
  // Event Subscription
  /** Invoke callback for all current and future style elements. */
  def observeStyleElements(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
  /** Invoke callback when a style element is added. */
  def onDidAddStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
  /** Invoke callback when a style element is removed. */
  def onDidRemoveStyleElement(callback: js.Function1[/* styleElement */ HTMLStyleElement, Unit]): Disposable = js.native
  /** Invoke callback when an existing style element is updated. */
  def onDidUpdateStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
}

object StyleManager {
  @scala.inline
  def apply(
    getStyleElements: () => js.Array[HTMLStyleElement],
    getUserStyleSheetPath: () => String,
    observeStyleElements: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
    onDidAddStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
    onDidRemoveStyleElement: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable,
    onDidUpdateStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable
  ): StyleManager = {
    val __obj = js.Dynamic.literal(getStyleElements = js.Any.fromFunction0(getStyleElements), getUserStyleSheetPath = js.Any.fromFunction0(getUserStyleSheetPath), observeStyleElements = js.Any.fromFunction1(observeStyleElements), onDidAddStyleElement = js.Any.fromFunction1(onDidAddStyleElement), onDidRemoveStyleElement = js.Any.fromFunction1(onDidRemoveStyleElement), onDidUpdateStyleElement = js.Any.fromFunction1(onDidUpdateStyleElement))
    __obj.asInstanceOf[StyleManager]
  }
  @scala.inline
  implicit class StyleManagerOps[Self <: StyleManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStyleElements(value: () => js.Array[HTMLStyleElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserStyleSheetPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserStyleSheetPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObserveStyleElements(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeStyleElements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDidAddStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidAddStyleElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDidRemoveStyleElement(value: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidRemoveStyleElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDidUpdateStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidUpdateStyleElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

