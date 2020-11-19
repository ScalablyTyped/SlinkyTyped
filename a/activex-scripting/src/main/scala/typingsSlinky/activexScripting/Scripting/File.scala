package typingsSlinky.activexScripting.Scripting

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** File object */
@js.native
trait File extends js.Object {
  
  /** File attributes */
  var Attributes: FileAttribute = js.native
  
  /**
    * Copy this file
    * @param boolean [OverWriteFiles=true]
    */
  def Copy(Destination: String): Unit = js.native
  def Copy(Destination: String, OverWriteFiles: Boolean): Unit = js.native
  
  /** Date file was created */
  val DateCreated: VarDate = js.native
  
  /** Date file was last accessed */
  val DateLastAccessed: VarDate = js.native
  
  /** Date file was last modified */
  val DateLastModified: VarDate = js.native
  
  /**
    * Delete this file
    * @param boolean [Force=false] Pass `true` to delete the file even if the read-only attribute is set
    */
  def Delete(): Unit = js.native
  def Delete(Force: Boolean): Unit = js.native
  
  /** Get drive that contains file */
  val Drive: typingsSlinky.activexScripting.Scripting.Drive = js.native
  
  /** Move this file */
  def Move(Destination: String): Unit = js.native
  
  /** Get name of file */
  var Name: String = js.native
  
  /**
    * Open a file as a TextStream
    * @param Scripting.IOMode [IOMode=1]
    * @param Scripting.Tristate [Format=0]
    */
  def OpenAsTextStream(): TextStream = js.native
  def OpenAsTextStream(IOMode: js.UndefOr[scala.Nothing], Format: Tristate): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode, Format: Tristate): TextStream = js.native
  
  /** Get folder that contains file */
  val ParentFolder: Folder = js.native
  
  /** Path to the file */
  val Path: String = js.native
  
  @JSName("Scripting.File_typekey")
  var ScriptingDotFile_typekey: File = js.native
  
  /** Short name */
  val ShortName: String = js.native
  
  /** Short path */
  val ShortPath: String = js.native
  
  /** File size */
  val Size: Double = js.native
  
  /** Type description */
  val Type: String = js.native
}
