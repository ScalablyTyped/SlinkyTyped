package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlQuerySpec extends js.Object {
  
  /** The array of SqlParameters. */
  var parameters: js.Array[SqlParameter] = js.native
  
  /** The body of the query. */
  var query: String = js.native
}
object SqlQuerySpec {
  
  @scala.inline
  def apply(parameters: js.Array[SqlParameter], query: String): SqlQuerySpec = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQuerySpec]
  }
  
  @scala.inline
  implicit class SqlQuerySpecOps[Self <: SqlQuerySpec] (val x: Self) extends AnyVal {
    
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
    def setParametersVarargs(value: SqlParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[SqlParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
