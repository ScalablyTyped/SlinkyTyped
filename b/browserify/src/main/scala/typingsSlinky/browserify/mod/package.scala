package typingsSlinky.browserify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
  // for each file in a bundle.
  type InputFile = java.lang.String | typingsSlinky.node.NodeJS.ReadableStream | typingsSlinky.browserify.mod.FileOptions
}
