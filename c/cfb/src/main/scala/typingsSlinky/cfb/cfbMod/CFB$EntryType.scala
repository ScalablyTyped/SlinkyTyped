package typingsSlinky.cfb.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFB$EntryType extends js.Object

@JSImport("cfb", "CFB$EntryType")
@js.native
object CFB$EntryType extends js.Object {
  @js.native
  sealed trait lockbytes extends CFB$EntryType
  
  @js.native
  sealed trait property extends CFB$EntryType
  
  @js.native
  sealed trait root extends CFB$EntryType
  
  @js.native
  sealed trait storage extends CFB$EntryType
  
  @js.native
  sealed trait stream extends CFB$EntryType
  
  @js.native
  sealed trait unknown extends CFB$EntryType
  
  /* 3 */ val lockbytes: typingsSlinky.cfb.cfbMod.CFB$EntryType.lockbytes with Double = js.native
  /* 4 */ val property: typingsSlinky.cfb.cfbMod.CFB$EntryType.property with Double = js.native
  /* 5 */ val root: typingsSlinky.cfb.cfbMod.CFB$EntryType.root with Double = js.native
  /* 1 */ val storage: typingsSlinky.cfb.cfbMod.CFB$EntryType.storage with Double = js.native
  /* 2 */ val stream: typingsSlinky.cfb.cfbMod.CFB$EntryType.stream with Double = js.native
  /* 0 */ val unknown: typingsSlinky.cfb.cfbMod.CFB$EntryType.unknown with Double = js.native
  @JSBracketAccess
  @JSName("CFB$EntryType")
  def apply(value: Double): js.UndefOr[CFB$EntryType with Double] = js.native
}

