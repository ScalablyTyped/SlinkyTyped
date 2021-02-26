package typingsSlinky.dropboxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Dropbox {
  
  type ClientFileReadCallback = js.Function4[
    /* err */ typingsSlinky.dropboxjs.Dropbox.ApiError, 
    /* fileContents */ java.lang.String, 
    /* stat */ typingsSlinky.dropboxjs.Dropbox.File.Stat, 
    /* rangeInfo */ typingsSlinky.dropboxjs.Dropbox.Http.RangeInfo, 
    scala.Unit
  ]
  
  type ClientFileWriteCallback = js.Function2[
    /* err */ typingsSlinky.dropboxjs.Dropbox.ApiError, 
    /* stat */ typingsSlinky.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  
  type FileStatCallback = js.Function2[
    /* err */ typingsSlinky.dropboxjs.Dropbox.ApiError, 
    /* stat */ typingsSlinky.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type QueryParamsCallback = js.Function1[/* queryParams */ typingsSlinky.dropboxjs.Dropbox.QueryParams, scala.Unit]
  
  type ResumableUploadStepCallback = js.Function2[
    /* err */ typingsSlinky.dropboxjs.Dropbox.ApiError, 
    /* uploadCursor */ typingsSlinky.dropboxjs.Dropbox.Http.UploadCursor, 
    scala.Unit
  ]
}
