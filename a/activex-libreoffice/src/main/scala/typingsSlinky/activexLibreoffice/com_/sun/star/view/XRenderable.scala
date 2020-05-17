package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be rendered.
  * @since OOo 1.1.2
  */
@js.native
trait XRenderable extends XInterface {
  /**
    * @returns a descriptor of the specific renderer.  returns the specific renderer properties based on the given selection.  If the selection contains a valid
    * @see RenderDescriptor
    * @see RenderOptions
    */
  def getRenderer(nRenderer: Double, aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): SafeArray[PropertyValue] = js.native
  /**
    * @returns the count of renderers (based on paper count of a document, for example).  If a selection is given, the count has to be calculated based on this
    * @see RenderOptions
    */
  def getRendererCount(aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): Double = js.native
  /**
    * renders the object.
    *
    * renders the object with the specific renderer based on the given selection.
    *
    * If the selection contains a valid XModel interface, it is assumed that the whole document should be rendered. If the selection is empty, nothing
    * should be rendered.
    * @see RenderOptions
    */
  def render(nRenderer: Double, aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): Unit = js.native
}

object XRenderable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getRenderer: (Double, js.Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue],
    getRendererCount: (js.Any, SeqEquiv[PropertyValue]) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: (Double, js.Any, SeqEquiv[PropertyValue]) => Unit
  ): XRenderable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRenderer = js.Any.fromFunction3(getRenderer), getRendererCount = js.Any.fromFunction2(getRendererCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction3(render))
    __obj.asInstanceOf[XRenderable]
  }
  @scala.inline
  implicit class XRenderableOps[Self <: XRenderable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRenderer(value: (Double, js.Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetRendererCount(value: (js.Any, SeqEquiv[PropertyValue]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRendererCount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRender(value: (Double, js.Any, SeqEquiv[PropertyValue]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

