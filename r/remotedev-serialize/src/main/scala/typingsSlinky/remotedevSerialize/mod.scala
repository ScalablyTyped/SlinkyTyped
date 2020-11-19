package typingsSlinky.remotedevSerialize

import typingsSlinky.remotedevSerialize.anon.Parse
import typingsSlinky.remotedevSerialize.anon.TypeofImmutable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("remotedev-serialize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def immutable(immutable: TypeofImmutable): Parse = js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: js.UndefOr[scala.Nothing],
    customReplacer: js.UndefOr[scala.Nothing],
    customReviver: Reviver
  ): Parse = js.native
  def immutable(immutable: TypeofImmutable, refs: js.UndefOr[scala.Nothing], customReplacer: Replacer): Parse = js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: js.UndefOr[scala.Nothing],
    customReplacer: Replacer,
    customReviver: Reviver
  ): Parse = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs): Parse = js.native
  def immutable(
    immutable: TypeofImmutable,
    refs: Refs,
    customReplacer: js.UndefOr[scala.Nothing],
    customReviver: Reviver
  ): Parse = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Parse = js.native
  def immutable(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Parse = js.native
  
  type DefaultReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  type DefaultReviver = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  
  type Options = Record[String, Boolean]
  
  type Refs = Record[String, js.Any]
  
  type Replacer = js.Function3[/* key */ String, /* value */ js.Any, /* replacer */ DefaultReplacer, js.Any]
  
  type Reviver = js.Function3[/* key */ String, /* value */ js.Any, /* reviver */ DefaultReviver, js.Any]
}
