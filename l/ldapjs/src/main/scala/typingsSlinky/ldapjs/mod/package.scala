package typingsSlinky.ldapjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallBack = js.Function2[
    /* error */ typingsSlinky.ldapjs.mod.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type CompareCallback = js.Function2[
    /* error */ typingsSlinky.ldapjs.mod.Error | scala.Null, 
    /* matched */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type Control = js.Any
  
  type ErrorCallback = js.Function1[/* error */ typingsSlinky.ldapjs.mod.Error, scala.Unit]
  
  type ExopCallback = js.Function3[
    /* error */ typingsSlinky.ldapjs.mod.Error | scala.Null, 
    /* value */ java.lang.String, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type SearchCallBack = js.Function2[
    /* error */ typingsSlinky.ldapjs.mod.Error | scala.Null, 
    /* result */ typingsSlinky.ldapjs.mod.SearchCallbackResponse, 
    scala.Unit
  ]
  
  type SearchReference = js.Any
  
  @scala.inline
  def createClient(): typingsSlinky.ldapjs.mod.Client = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[typingsSlinky.ldapjs.mod.Client]
  @scala.inline
  def createClient(options: typingsSlinky.ldapjs.mod.ClientOptions): typingsSlinky.ldapjs.mod.Client = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ldapjs.mod.Client]
  
  @scala.inline
  def createServer(): typingsSlinky.ldapjs.mod.Server = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typingsSlinky.ldapjs.mod.Server]
  @scala.inline
  def createServer(options: typingsSlinky.ldapjs.mod.ServerOptions): typingsSlinky.ldapjs.mod.Server = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ldapjs.mod.Server]
  
  @scala.inline
  def parseDN(dn: java.lang.String): js.Any = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseDN")(dn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def parseFilter(filterString: java.lang.String): typingsSlinky.ldapjs.mod.Filter = typingsSlinky.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ldapjs.mod.Filter]
}
