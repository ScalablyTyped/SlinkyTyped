package typingsSlinky.mockjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type B = scala.Boolean
  
  type MockjsRandomExtendOption = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  // Mockjs.setup()
  // see https://github.com/nuysoft/Mock/wiki/Mock.setup()
  type MockjsSetup = js.Function1[/* settings */ typingsSlinky.mockjs.mod.MockjsSetupSettings, scala.Unit]
  
  // Mockjs.toJSONSchema()
  // see https://github.com/nuysoft/Mock/wiki/Mock.toJSONSchema()
  type MockjsToJSONSchema = js.Function1[/* template */ js.Any, typingsSlinky.mockjs.mod.MockjsToJSONSchemaRs]
  
  // Mockjs.valid()
  // see https://github.com/nuysoft/Mock/wiki/Mock.valid()
  type MockjsValid = js.Function2[
    /* template */ js.Any, 
    /* data */ js.Any, 
    js.Array[typingsSlinky.mockjs.mod.MockjsValidRsItem]
  ]
  
  type N = scala.Double
  
  type S = java.lang.String
}
