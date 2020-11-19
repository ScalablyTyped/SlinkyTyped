package typingsSlinky.chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Chai {
  
  type AssertStatic = typingsSlinky.chai.Chai.Assert
  
  // chai.Assertion.prototype.assert arguments
  type AssertionArgs = js.Tuple6[
    // 'expression to be tested'
  // This parameter is unused and the docs list its type as
  // 'Philosophical', which is mentioned nowhere else in the source. Do
  // with that what you will!
  js.Any, 
    typingsSlinky.chai.Chai.Message, 
    typingsSlinky.chai.Chai.Message, 
    js.Any, 
    js.UndefOr[js.Any], 
    js.UndefOr[scala.Boolean]
  ]
  
  type ChaiPlugin = js.Function2[
    /* chai */ typingsSlinky.chai.Chai.ChaiStatic, 
    /* utils */ typingsSlinky.chai.Chai.ChaiUtils, 
    scala.Unit
  ]
  
  type CloseTo = js.Function3[
    /* expected */ scala.Double, 
    /* delta */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type Equal = js.Function2[
    /* value */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type InstanceOf = js.Function2[
    /* constructor */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type Match = js.Function2[
    /* regexp */ js.RegExp, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type Members = js.Function2[
    /* set */ js.Array[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type Message = java.lang.String | js.Function0[java.lang.String]
  
  type NumberComparer = js.Function2[
    /* value */ scala.Double | js.Date, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type ObjectProperty = java.lang.String | js.Symbol | scala.Double
  
  type Operator = java.lang.String
  
  type OperatorComparable = js.UndefOr[scala.Boolean | scala.Null | scala.Double | java.lang.String | js.Date]
  
  type PropertyChange = js.Function3[
    /* object */ typingsSlinky.chai.Object, 
    /* property */ js.UndefOr[java.lang.String], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type RespondTo = js.Function2[
    /* method */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
  
  type Satisfy = js.Function2[
    /* matcher */ js.Function, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.chai.Chai.Assertion
  ]
}
