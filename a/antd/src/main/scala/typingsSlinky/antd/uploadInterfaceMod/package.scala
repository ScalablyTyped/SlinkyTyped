package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object uploadInterfaceMod {
  
  type HttpRequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type PreviewFileHandler = js.Function1[
    /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob, 
    js.Thenable[java.lang.String]
  ]
  
  type TransformFileHandler = js.Function1[
    /* file */ typingsSlinky.antd.uploadInterfaceMod.RcFile, 
    java.lang.String | org.scalajs.dom.raw.Blob | org.scalajs.dom.raw.File | (js.Thenable[java.lang.String | org.scalajs.dom.raw.Blob | org.scalajs.dom.raw.File])
  ]
}
