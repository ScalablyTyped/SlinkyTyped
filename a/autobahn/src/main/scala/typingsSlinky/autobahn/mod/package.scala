package typingsSlinky.autobahn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = java.lang.String with typingsSlinky.autobahn.anon.ZzIGNOREME
  
  type DeferFactory = js.Function0[typingsSlinky.when.When.Promise[js.Any]]
  
  type OnChallengeHandler = js.Function3[
    /* session */ typingsSlinky.autobahn.mod.Session, 
    /* method */ java.lang.String, 
    /* extra */ js.Any, 
    java.lang.String | typingsSlinky.when.When.Promise[java.lang.String]
  ]
  
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsSlinky.autobahn.mod.IInvocation], 
    scala.Unit
  ]
  
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsSlinky.autobahn.mod.IEvent], 
    scala.Unit
  ]
  
  type TransportType = typingsSlinky.autobahn.mod.DefaultTransportType | typingsSlinky.autobahn.mod.CustomTransportType
  
  @scala.inline
  def authCra: typingsSlinky.autobahn.mod.IAuthCra = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("auth_cra").asInstanceOf[typingsSlinky.autobahn.mod.IAuthCra]
  @scala.inline
  def authCra_=(x: typingsSlinky.autobahn.mod.IAuthCra): scala.Unit = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("auth_cra")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def log: typingsSlinky.autobahn.mod.ILog = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[typingsSlinky.autobahn.mod.ILog]
  @scala.inline
  def log_=(x: typingsSlinky.autobahn.mod.ILog): scala.Unit = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def transports: typingsSlinky.autobahn.mod.ITransports = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transports").asInstanceOf[typingsSlinky.autobahn.mod.ITransports]
  @scala.inline
  def transports_=(x: typingsSlinky.autobahn.mod.ITransports): scala.Unit = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("transports")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def util: typingsSlinky.autobahn.mod.IUtil = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[typingsSlinky.autobahn.mod.IUtil]
  @scala.inline
  def util_=(x: typingsSlinky.autobahn.mod.IUtil): scala.Unit = typingsSlinky.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])
}
