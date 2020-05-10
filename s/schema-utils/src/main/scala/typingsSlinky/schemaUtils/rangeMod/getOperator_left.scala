package typingsSlinky.schemaUtils.rangeMod

import typingsSlinky.schemaUtils.schemaUtilsStrings.Greaterthansign
import typingsSlinky.schemaUtils.schemaUtilsStrings.GreaterthansignEqualssign
import typingsSlinky.schemaUtils.schemaUtilsStrings.Lessthansign
import typingsSlinky.schemaUtils.schemaUtilsStrings.LessthansignEqualssign
import typingsSlinky.schemaUtils.schemaUtilsStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/util/Range", "getOperator")
@js.native
object getOperator_left extends js.Object {
  /**
    * @param {"left" | "right"} side
    * @param {boolean} exclusive
    * @returns {">" | ">=" | "<" | "<="}
    */
  def apply(side: left, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
}

