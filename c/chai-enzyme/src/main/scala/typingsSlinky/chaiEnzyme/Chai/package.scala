package typingsSlinky.chaiEnzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chai {
  type Match = js.Function1[
    /* selector */ typingsSlinky.chaiEnzyme.Chai.EnzymeSelector, 
    typingsSlinky.chaiEnzyme.Chai.Assertion
  ]
}
