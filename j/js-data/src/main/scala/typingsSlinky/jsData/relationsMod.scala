package typingsSlinky.jsData

import typingsSlinky.jsData.relationMod.RelationOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-data/dist/relations", JSImport.Namespace)
@js.native
object relationsMod extends js.Object {
  
  val belongsToType: /* "belongsTo" */ String = js.native
  
  val hasManyType: /* "hasMany" */ String = js.native
  
  val hasOneType: /* "hasOne" */ String = js.native
  
  @js.native
  abstract class Relation protected ()
    extends typingsSlinky.jsData.relationMod.Relation {
    def this(relatedMapper: js.Any) = this()
    def this(relatedMapper: js.Any, options: RelationOpts) = this()
  }
  /* static members */
  @js.native
  object Relation extends js.Object {
    
    var belongsTo: js.Any = js.native
    
    var hasMany: js.Any = js.native
    
    var hasOne: js.Any = js.native
  }
}
