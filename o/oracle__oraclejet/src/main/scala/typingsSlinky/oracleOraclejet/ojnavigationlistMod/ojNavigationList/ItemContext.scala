package typingsSlinky.oracleOraclejet.ojnavigationlistMod.ojNavigationList

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemContext[K, D] extends js.Object {
  
  var componentElement: Element = js.native
  
  var data: js.Any = js.native
  
  var datasource: js.UndefOr[DataProvider[K, D]] = js.native
  
  var index: Double = js.native
  
  var key: js.Any = js.native
  
  var parentElement: Element = js.native
}
object ItemContext {
  
  @scala.inline
  def apply[K, D](componentElement: Element, data: js.Any, index: Double, key: js.Any, parentElement: Element): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K, D]]
  }
  
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext[_, _], K, D] (val x: Self with (ItemContext[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasource: Self = this.set("datasource", js.undefined)
  }
}
