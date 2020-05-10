package typingsSlinky.reactSelect.groupMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ReactComponentClass[_] = js.native
  /** The children to be rendered. */
  var children: TagMod[Any] = js.native
  /** Props to pass to Heading. */
  var headingProps: js.Any = js.native
  /** Label to be displayed in the heading component. */
  var label: TagMod[Any] = js.native
}

object ComponentProps {
  @scala.inline
  def apply(Heading: ReactComponentClass[_], headingProps: js.Any): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  @scala.inline
  implicit class ComponentPropsOps[Self <: ComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeading(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadingProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

