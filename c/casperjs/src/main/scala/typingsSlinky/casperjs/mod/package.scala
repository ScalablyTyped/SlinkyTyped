package typingsSlinky.casperjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FunctionOnTimeout = js.ThisFunction2[
    /* this */ typingsSlinky.casperjs.mod.Casper, 
    /* timeout */ scala.Double, 
    /* details */ js.Any, 
    scala.Unit
  ]
  
  type FunctionThen = js.ThisFunction1[
    /* this */ typingsSlinky.casperjs.mod.Casper, 
    /* response */ typingsSlinky.casperjs.mod.HttpResponse, 
    scala.Unit
  ]
  
  @scala.inline
  def create(): typingsSlinky.casperjs.mod.Casper = typingsSlinky.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsSlinky.casperjs.mod.Casper]
  @scala.inline
  def create(options: typingsSlinky.casperjs.mod.CasperOptions): typingsSlinky.casperjs.mod.Casper = typingsSlinky.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.casperjs.mod.Casper]
  
  @scala.inline
  def selectXPath(expression: java.lang.String): js.Object = typingsSlinky.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selectXPath")(expression.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
