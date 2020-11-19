package typingsSlinky.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object core {
  
  type BodyData = typingsSlinky.node.Buffer | typingsSlinky.needle.mod.core.KeyValue | typingsSlinky.node.NodeJS.ReadableStream | java.lang.String | scala.Null
  
  type Cookies = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type KeyValue = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type NeedleCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* response */ typingsSlinky.needle.mod.core.NeedleResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  
  type NeedleOptions = typingsSlinky.needle.mod.core.RequestOptions with typingsSlinky.needle.mod.core.ResponseOptions with typingsSlinky.needle.mod.core.RedirectOptions with typingsSlinky.node.httpsMod.RequestOptions
  
  type ReadableStream = typingsSlinky.node.NodeJS.ReadableStream
}
