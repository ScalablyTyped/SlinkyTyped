package typingsSlinky.parseGitConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: Can this be defined more precisely?
  type Config = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ParseCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* config */ typingsSlinky.parseGitConfig.mod.Config, 
    scala.Unit
  ]
}
