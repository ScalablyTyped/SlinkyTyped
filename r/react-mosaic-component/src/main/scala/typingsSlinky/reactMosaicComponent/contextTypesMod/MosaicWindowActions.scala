package typingsSlinky.reactMosaicComponent.contextTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicWindowActions extends js.Object {
  /**
    * Enables connecting a different drag source besides the react-mosaic toolbar
    */
  def connectDragSource(connectedElements: ReactElement): ReactElement | Null = js.native
  /**
    * Returns the path to this window
    */
  def getPath(): MosaicPath = js.native
  /**
    * Fails if no `createNode()` is defined
    * Convenience function to call `createNode()` and replace the current node with it.
    */
  def replaceWithNew(args: js.Any*): js.Promise[Unit] = js.native
  /**
    * Sets the open state for the tray that holds additional controls
    */
  def setAdditionalControlsOpen(open: Boolean): Unit = js.native
  /**
    * Fails if no `createNode()` is defined
    * Creates a new node and splits the current node.
    * The current node becomes the `first` and the new node the `second` of the result.
    * `direction` is chosen by querying the DOM and splitting along the longer axis
    */
  def split(args: js.Any*): js.Promise[Unit] = js.native
}

object MosaicWindowActions {
  @scala.inline
  def apply(
    connectDragSource: ReactElement => ReactElement | Null,
    getPath: () => MosaicPath,
    replaceWithNew: /* repeated */ js.Any => js.Promise[Unit],
    setAdditionalControlsOpen: Boolean => Unit,
    split: /* repeated */ js.Any => js.Promise[Unit]
  ): MosaicWindowActions = {
    val __obj = js.Dynamic.literal(connectDragSource = js.Any.fromFunction1(connectDragSource), getPath = js.Any.fromFunction0(getPath), replaceWithNew = js.Any.fromFunction1(replaceWithNew), setAdditionalControlsOpen = js.Any.fromFunction1(setAdditionalControlsOpen), split = js.Any.fromFunction1(split))
    __obj.asInstanceOf[MosaicWindowActions]
  }
  @scala.inline
  implicit class MosaicWindowActionsOps[Self <: MosaicWindowActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectDragSource(value: ReactElement => ReactElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPath(value: () => MosaicPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceWithNew(value: /* repeated */ js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithNew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAdditionalControlsOpen(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdditionalControlsOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplit(value: /* repeated */ js.Any => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

