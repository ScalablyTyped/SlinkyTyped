package typingsSlinky.builderUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsMod {
  
  type AfterCopyFileTransformer = js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]
  
  type FileTransformer = js.Function1[
    /* file */ java.lang.String, 
    (js.Promise[
      scala.Null | java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.builderUtil.fsMod.CopyFileTransformer
    ]) | scala.Null | java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.builderUtil.fsMod.CopyFileTransformer
  ]
  
  type Filter = js.Function2[
    /* file */ java.lang.String, 
    /* stat */ typingsSlinky.fsExtra.mod.Stats, 
    scala.Boolean
  ]
}
