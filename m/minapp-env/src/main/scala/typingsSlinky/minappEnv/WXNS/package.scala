package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WXNS {
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type downloadFile = js.Function1[
    /* param */ typingsSlinky.minappEnv.WXNS.IDownloadFileParam, 
    typingsSlinky.minappEnv.WXNS.IDownloadFileTask
  ]
  
  type getFileInfo = js.Function1[/* param */ typingsSlinky.minappEnv.WXNS.IGetFileInfoParam, scala.Unit]
  
  type operateWXData = js.Function1[/* param */ js.Any, scala.Unit]
  
  type request = js.Function1[
    /* param */ typingsSlinky.minappEnv.WXNS.IRequestParam, 
    typingsSlinky.minappEnv.WXNS.IRequestTask
  ]
  
  type uploadFile = js.Function1[
    /* param */ typingsSlinky.minappEnv.WXNS.IUploadFileParam, 
    typingsSlinky.minappEnv.WXNS.IUploadFileTask
  ]
}
