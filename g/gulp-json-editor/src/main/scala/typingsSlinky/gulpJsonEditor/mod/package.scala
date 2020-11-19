package typingsSlinky.gulpJsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JEditor = js.Function2[
    /* mergeWith */ js.Any | (js.Function1[/* json */ js.Any, js.Any]), 
    /* jsBeautifyOptions */ js.UndefOr[typingsSlinky.jsBeautify.JSBeautifyOptions], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
}
