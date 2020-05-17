package typingsSlinky.materialUiStyles.anon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[Name /* <: /* keyof any */ String */] extends js.Object {
  var props: Record[
    Name, 
    /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
  ] = js.native
}

object Props {
  @scala.inline
  def apply[Name](
    props: Record[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
    ]
  ): Props[Name] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[Name]]
  }
  @scala.inline
  implicit class PropsOps[Self[name] <: Props[name], Name] (val x: Self[Name]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Name] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Name] with Other]
    @scala.inline
    def withProps(
      value: Record[
          Name, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
        ]
    ): Self[Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

