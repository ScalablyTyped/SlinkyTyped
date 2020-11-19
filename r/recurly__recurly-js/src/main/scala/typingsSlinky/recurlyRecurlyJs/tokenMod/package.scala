package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tokenMod {
  
  type CustomerData = typingsSlinky.recurlyRecurlyJs.addressMod.Address
  
  type ElementsToken = js.Function3[
    /* elements */ typingsSlinky.recurlyRecurlyJs.elementsMod.ElementsInstance, 
    /* second */ org.scalajs.dom.raw.HTMLFormElement | typingsSlinky.recurlyRecurlyJs.tokenMod.CustomerData, 
    /* third */ typingsSlinky.recurlyRecurlyJs.tokenMod.TokenHandler, 
    scala.Unit
  ]
  
  type HostedFieldToken = js.Function2[
    /* form */ org.scalajs.dom.raw.HTMLFormElement | typingsSlinky.recurlyRecurlyJs.tokenMod.CustomerData, 
    /* second */ typingsSlinky.recurlyRecurlyJs.tokenMod.TokenHandler, 
    scala.Unit
  ]
  
  type Token = typingsSlinky.recurlyRecurlyJs.tokenMod.HostedFieldToken with typingsSlinky.recurlyRecurlyJs.tokenMod.ElementsToken
  
  type TokenHandler = js.Function2[
    /* error */ typingsSlinky.recurlyRecurlyJs.errorMod.RecurlyError | scala.Null, 
    /* token */ typingsSlinky.recurlyRecurlyJs.tokenMod.TokenPayload, 
    scala.Unit
  ]
}
