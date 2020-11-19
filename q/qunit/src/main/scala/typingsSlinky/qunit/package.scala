package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object qunit {
  
  type QUnit = typingsSlinky.qunit.QUnit_
  
  type moduleFunc1 = js.Function3[
    /* name */ java.lang.String, 
    /* hooks */ js.UndefOr[typingsSlinky.qunit.Hooks], 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typingsSlinky.qunit.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
  
  type moduleFunc2 = js.Function2[
    /* name */ java.lang.String, 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typingsSlinky.qunit.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
}
