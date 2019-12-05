package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Size extends js.Object

/**
  * Enumeration of possible size settings.
  */
@JSGlobal("sap.m.Size")
@js.native
object Size extends js.Object {
  @js.native
  sealed trait Auto extends Size
  
  @js.native
  sealed trait L extends Size
  
  @js.native
  sealed trait M extends Size
  
  @js.native
  sealed trait S extends Size
  
  @js.native
  sealed trait XS extends Size
  
  /* 0 */ val Auto: typingsSlinky.openui5.sap.m.Size.Auto with Double = js.native
  /* 1 */ val L: typingsSlinky.openui5.sap.m.Size.L with Double = js.native
  /* 2 */ val M: typingsSlinky.openui5.sap.m.Size.M with Double = js.native
  /* 3 */ val S: typingsSlinky.openui5.sap.m.Size.S with Double = js.native
  /* 4 */ val XS: typingsSlinky.openui5.sap.m.Size.XS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Size with Double] = js.native
}

