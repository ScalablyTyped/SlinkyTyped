package typingsSlinky.resolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Callback invoked when checking if a file or directory exists
    *
    * @param error
    * @param exists If the given file or directory exists
    */
  type existsCallback = js.Function2[/* err */ js.Error | scala.Null, /* isFile */ js.UndefOr[scala.Boolean], scala.Unit]
  
  /**
    * Callback invoked when reading a file
    *
    * @param error
    * @param isFile If the given file exists
    */
  type readFileCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsSlinky.node.Buffer], 
    scala.Unit
  ]
  
  /**
    * Callback invoked when resolving a potential symlink
    *
    * @param error
    * @param resolved Absolute path to the resolved file
    */
  type realpathCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    /* pkg */ js.UndefOr[typingsSlinky.resolve.mod.PackageMeta], 
    scala.Unit
  ]
}
