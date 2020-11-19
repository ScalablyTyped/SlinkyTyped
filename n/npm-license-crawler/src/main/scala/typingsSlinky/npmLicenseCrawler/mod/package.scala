package typingsSlinky.npmLicenseCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* licenses */ typingsSlinky.npmLicenseCrawler.mod.Licenses, 
    scala.Unit
  ]
  
  type Licenses = org.scalablytyped.runtime.StringDictionary[typingsSlinky.npmLicenseCrawler.anon.LicenseUrl]
}
