package typingsSlinky.npm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object NPM {
  
  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[js.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* result2 */ js.UndefOr[js.Any], 
    /* result3 */ js.UndefOr[js.Any], 
    /* result4 */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type CommandFunction = js.Function2[
    /* args */ js.Array[java.lang.String], 
    /* callback */ typingsSlinky.npm.mod.NPM.CommandCallback, 
    scala.Unit
  ]
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], scala.Unit]
}
