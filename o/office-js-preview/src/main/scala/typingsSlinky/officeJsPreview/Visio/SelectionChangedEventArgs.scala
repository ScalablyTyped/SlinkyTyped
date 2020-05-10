package typingsSlinky.officeJsPreview.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape collection that raised the SelectionChanged event.
  *
  * [Api set:  1.1]
  */
@js.native
trait SelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page which has the ShapeCollection object that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var pageName: String = js.native
  /**
    *
    * Gets the array of shape names that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var shapeNames: js.Array[String] = js.native
}

object SelectionChangedEventArgs {
  @scala.inline
  def apply(pageName: String, shapeNames: js.Array[String]): SelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], shapeNames = shapeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedEventArgs]
  }
  @scala.inline
  implicit class SelectionChangedEventArgsOps[Self <: SelectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

