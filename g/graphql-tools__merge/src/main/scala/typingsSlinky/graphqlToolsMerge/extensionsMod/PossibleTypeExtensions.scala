package typingsSlinky.graphqlToolsMerge.extensionsMod

import typingsSlinky.graphqlToolsMerge.anon.Arguments
import typingsSlinky.graphqlToolsMerge.anon.Extensions
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.`object`
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.enum
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.input
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.interface
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.scalar
import typingsSlinky.graphqlToolsMerge.graphqlToolsMergeStrings.union
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlToolsMerge.extensionsMod.InputTypeExtensions
  - typingsSlinky.graphqlToolsMerge.extensionsMod.InterfaceTypeExtensions
  - typingsSlinky.graphqlToolsMerge.extensionsMod.ObjectTypeExtensions
  - typingsSlinky.graphqlToolsMerge.extensionsMod.UnionTypeExtensions
  - typingsSlinky.graphqlToolsMerge.extensionsMod.ScalarTypeExtensions
  - typingsSlinky.graphqlToolsMerge.extensionsMod.EnumTypeExtensions
*/
trait PossibleTypeExtensions extends js.Object

object PossibleTypeExtensions {
  @scala.inline
  def ObjectTypeExtensions(fields: Record[String, Arguments], `type`: `object`): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def UnionTypeExtensions(`type`: union): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def InterfaceTypeExtensions(fields: Record[String, Arguments], `type`: interface): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def InputTypeExtensions(fields: Record[String, Extensions], `type`: input): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def EnumTypeExtensions(`type`: enum, values: Record[String, ExtensionsObject]): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def ScalarTypeExtensions(`type`: scalar): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
}

