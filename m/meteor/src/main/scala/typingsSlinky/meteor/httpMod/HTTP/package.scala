package typingsSlinky.meteor.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object HTTP {
  
  type AsyncCallback = js.Function2[
    /* error */ typingsSlinky.meteor.Meteor.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.meteor.httpMod.HTTP.HTTPResponse], 
    scala.Unit
  ]
}
