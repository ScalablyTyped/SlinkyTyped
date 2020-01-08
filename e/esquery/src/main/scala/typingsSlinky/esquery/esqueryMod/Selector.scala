package typingsSlinky.esquery.esqueryMod

import typingsSlinky.esquery.esqueryStrings.Asterisk
import typingsSlinky.esquery.esqueryStrings.Equalssign
import typingsSlinky.esquery.esqueryStrings.ExclamationmarkEqualssign
import typingsSlinky.esquery.esqueryStrings.Greaterthansign
import typingsSlinky.esquery.esqueryStrings.GreaterthansignEqualssign
import typingsSlinky.esquery.esqueryStrings.Lessthansign
import typingsSlinky.esquery.esqueryStrings.LessthansignEqualssign
import typingsSlinky.esquery.esqueryStrings.`class`
import typingsSlinky.esquery.esqueryStrings.`nth-child`
import typingsSlinky.esquery.esqueryStrings.`nth-last-child`
import typingsSlinky.esquery.esqueryStrings.`type`
import typingsSlinky.esquery.esqueryStrings.adjacent
import typingsSlinky.esquery.esqueryStrings.attribute
import typingsSlinky.esquery.esqueryStrings.child
import typingsSlinky.esquery.esqueryStrings.compound
import typingsSlinky.esquery.esqueryStrings.declaration
import typingsSlinky.esquery.esqueryStrings.descendant
import typingsSlinky.esquery.esqueryStrings.expression
import typingsSlinky.esquery.esqueryStrings.field
import typingsSlinky.esquery.esqueryStrings.function
import typingsSlinky.esquery.esqueryStrings.has
import typingsSlinky.esquery.esqueryStrings.identifier
import typingsSlinky.esquery.esqueryStrings.not
import typingsSlinky.esquery.esqueryStrings.pattern
import typingsSlinky.esquery.esqueryStrings.sibling
import typingsSlinky.esquery.esqueryStrings.statement
import typingsSlinky.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typings.esquery.esqueryMod.Field
  - typings.esquery.esqueryMod.Type
  - typings.esquery.esqueryMod.Sequence
  - typings.esquery.esqueryMod.Identifier
  - typings.esquery.esqueryMod.Wildcard
  - typings.esquery.esqueryMod.Attribute
  - typings.esquery.esqueryMod.NthChild
  - typings.esquery.esqueryMod.NthLastChild
  - typings.esquery.esqueryMod.Descendant
  - typings.esquery.esqueryMod.Child
  - typings.esquery.esqueryMod.Sibling
  - typings.esquery.esqueryMod.Adjacent
  - typings.esquery.esqueryMod.Negation
  - typings.esquery.esqueryMod.Matches
  - typings.esquery.esqueryMod.Has
  - typings.esquery.esqueryMod.Class
*/
trait Selector extends js.Object

object Selector {
  @scala.inline
  def Descendant(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Adjacent(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: adjacent,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Field(name: String, `type`: field): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Attribute(
    name: String,
    `type`: attribute,
    operator: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = null,
    subject: js.UndefOr[Boolean] = js.undefined,
    value: Literal | RegExpLiteral | Type = null
  ): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Sibling(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: sibling,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Matches(
    selectors: js.Array[SubjectSelector],
    `type`: typingsSlinky.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Child(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: child,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Sequence(
    selectors: js.Array[SubjectSelector],
    `type`: compound,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Class(name: declaration | expression | function | pattern | statement, `type`: `class`): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Type(`type`: `type`, value: String): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Identifier(`type`: identifier, value: String, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

