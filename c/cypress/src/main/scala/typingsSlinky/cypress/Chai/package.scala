package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chai {
  type AssertStatic = typingsSlinky.cypress.Chai.Assert
  // chai.Assertion.prototype.assert arguments
  type AssertionArgs = js.Tuple6[
    // 'expression to be tested'
  // This parameter is unused and the docs list its type as
  // 'Philosophical', which is mentioned nowhere else in the source. Do
  // with that what you will!
  js.Any, 
    typingsSlinky.cypress.Chai.Message, 
    typingsSlinky.cypress.Chai.Message, 
    js.Any, 
    js.UndefOr[js.Any], 
    js.UndefOr[scala.Boolean]
  ]
  type ChaiPlugin = js.Function2[
    /* chai */ typingsSlinky.cypress.Chai.ChaiStatic, 
    /* utils */ typingsSlinky.cypress.Chai.ChaiUtils, 
    scala.Unit
  ]
  type CloseTo = js.Function3[
    /* expected */ scala.Double, 
    /* delta */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type Equal = js.Function2[
    /* value */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type InstanceOf = js.Function2[
    /* constructor */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type Members = js.Function2[
    /* set */ js.Array[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type NumberComparer = js.Function2[
    /* value */ scala.Double | js.Date, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type Operator = java.lang.String
  type PropertyChange = js.Function3[
    /* object */ typingsSlinky.cypress.Object, 
    /* property */ js.UndefOr[java.lang.String], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type RespondTo = js.Function2[
    /* method */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
  type Satisfy = js.Function2[
    /* matcher */ js.Function, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.Chai.Assertion
  ]
}
