package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceObject extends js.Object {
  val DOM: IXMLDOMDocument = js.native
  @JSName("InfoPath.DataSourceObject_typekey")
  var InfoPathDotDataSourceObject_typekey: DataSourceObject = js.native
  val Name: String = js.native
  val QueryAdapter: js.Any = js.native
  def Query(): Unit = js.native
}

object DataSourceObject {
  @scala.inline
  def apply(
    DOM: IXMLDOMDocument,
    InfoPathDotDataSourceObject_typekey: DataSourceObject,
    Name: String,
    Query: () => Unit,
    QueryAdapter: js.Any
  ): DataSourceObject = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAdapter = QueryAdapter.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DataSourceObject_typekey")(InfoPathDotDataSourceObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceObject]
  }
  @scala.inline
  implicit class DataSourceObjectOps[Self <: DataSourceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOM(value: IXMLDOMDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotDataSourceObject_typekey(value: DataSourceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DataSourceObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryAdapter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryAdapter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

