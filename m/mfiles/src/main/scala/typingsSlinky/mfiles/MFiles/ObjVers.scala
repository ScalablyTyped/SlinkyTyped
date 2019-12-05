package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IObjIDs
import typingsSlinky.mfiles.IObjVer
import typingsSlinky.mfiles.IObjVers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjVers")
@js.native
class ObjVers () extends IObjVers {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, ObjVer: IObjVer): Unit = js.native
  /* CompleteClass */
  override def Clone(): IObjVers = js.native
  /* CompleteClass */
  override def GetAllDistinctObjIDs(): IObjIDs = js.native
  /* CompleteClass */
  override def Item(Index: Double): IObjVer = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  /* CompleteClass */
  override def ToJSON(): String = js.native
}

@JSGlobal("MFiles.ObjVers")
@js.native
object ObjVers extends Instantiable0[IObjVers]

