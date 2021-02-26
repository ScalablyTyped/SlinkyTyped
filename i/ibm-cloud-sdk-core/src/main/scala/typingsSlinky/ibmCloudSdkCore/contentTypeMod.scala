package typingsSlinky.ibmCloudSdkCore

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.File
import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromFilename")
    @js.native
    def fromFilename(file: String): String = js.native
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromFilename")
    @js.native
    def fromFilename(file: ReadableStream[_]): String = js.native
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromFilename")
    @js.native
    def fromFilename(file: File): String = js.native
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromFilename")
    @js.native
    def fromFilename(file: FileObject): String = js.native
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromFilename")
    @js.native
    def fromFilename(file: Buffer): String = js.native
    
    @JSImport("ibm-cloud-sdk-core/lib/content-type", "default.fromHeader")
    @js.native
    def fromHeader(buffer: Buffer): String = js.native
  }
}
