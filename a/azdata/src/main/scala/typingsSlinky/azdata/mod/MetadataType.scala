package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSImport("azdata", "MetadataType")
@js.native
object MetadataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
  
  @js.native
  sealed trait Function extends MetadataType
  /* 3 */ val Function: typingsSlinky.azdata.mod.MetadataType.Function with Double = js.native
  
  @js.native
  sealed trait SProc extends MetadataType
  /* 2 */ val SProc: typingsSlinky.azdata.mod.MetadataType.SProc with Double = js.native
  
  @js.native
  sealed trait Table extends MetadataType
  /* 0 */ val Table: typingsSlinky.azdata.mod.MetadataType.Table with Double = js.native
  
  @js.native
  sealed trait View extends MetadataType
  /* 1 */ val View: typingsSlinky.azdata.mod.MetadataType.View with Double = js.native
}
