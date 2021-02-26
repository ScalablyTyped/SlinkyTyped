package typingsSlinky.reactFileUtils

import typingsSlinky.reactFileUtils.mod.UploadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactFileUtilsStrings {
  
  @js.native
  sealed trait failed extends UploadState
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait finished extends UploadState
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait uploading extends UploadState
  @scala.inline
  def uploading: uploading = "uploading".asInstanceOf[uploading]
}
