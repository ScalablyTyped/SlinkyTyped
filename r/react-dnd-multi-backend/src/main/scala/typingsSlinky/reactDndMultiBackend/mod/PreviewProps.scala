package typingsSlinky.reactDndMultiBackend.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewProps extends js.Object {
  /**
    * Callback function to generate a preview object when dragging. This preview will only be used
    * with backends that have the 'preview' flag set to true.
    * @param type: the type of the item (monitor.getItemType())
    * @param item: the item being dragged (monitor.getItem())
    * @param style: an object representing the style to use for the item, it should be passed to
    *               your component's style property and is used for positioning.
    * @returns The JSX element to display for the drag preview.
    */
  def generator(`type`: String, item: js.Any, style: CSSProperties): ReactElement = js.native
}

object PreviewProps {
  @scala.inline
  def apply(generator: (String, js.Any, CSSProperties) => ReactElement): PreviewProps = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction3(generator))
    __obj.asInstanceOf[PreviewProps]
  }
  @scala.inline
  implicit class PreviewPropsOps[Self <: PreviewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerator(value: (String, js.Any, CSSProperties) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

