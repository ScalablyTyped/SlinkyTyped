package typingsSlinky.remotedevDashSerialize

import typingsSlinky.remotedevDashSerialize.remotedevDashSerializeMod.Refs
import typingsSlinky.remotedevDashSerialize.remotedevDashSerializeMod.Replacer
import typingsSlinky.remotedevDashSerialize.remotedevDashSerializeMod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CustomReplacer extends js.Object {
  def parse(input: String): js.Any = js.native
  def serialize(immutable: TypeofImmutable): Anon_Options = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs): Anon_Options = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Anon_Options = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Anon_Options = js.native
  def stringify(input: js.Any): String = js.native
}

