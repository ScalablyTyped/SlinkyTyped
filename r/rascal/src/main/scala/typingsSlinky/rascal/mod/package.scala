package typingsSlinky.rascal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AckOrNack = js.Function2[
    /* err */ js.UndefOr[js.Error], 
    /* recovery */ js.UndefOr[typingsSlinky.rascal.mod.Recovery | js.Array[typingsSlinky.rascal.mod.Recovery]], 
    scala.Unit
  ]
  
  type Cb[E, A] = js.Function1[/* x */ js.Tuple2[E | scala.Null, A | scala.Nothing], scala.Unit]
  
  type ConnectCb = js.Function1[
    /* x */ js.Tuple2[js.Error | scala.Null, typingsSlinky.amqplib.mod.Connection | scala.Null], 
    scala.Unit
  ]
  
  type CreateCb = js.Function1[
    /* x */ js.Tuple2[js.Error | scala.Null, typingsSlinky.rascal.mod.Broker], 
    scala.Unit
  ]
  
  type ErrorCb = js.Function1[/* x */ js.Error | scala.Null, scala.Unit]
  
  @scala.inline
  def createBroker(
    config: typingsSlinky.rascal.mod.BrokerConfig,
    components: js.Any,
    next: typingsSlinky.rascal.mod.CreateCb
  ): scala.Unit = (typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def createBroker(config: typingsSlinky.rascal.mod.BrokerConfig, next: typingsSlinky.rascal.mod.CreateCb): scala.Unit = (typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createBrokerAsPromised(config: typingsSlinky.rascal.mod.BrokerConfig): js.Promise[typingsSlinky.rascal.mod.BrokerAsPromised] = typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.rascal.mod.BrokerAsPromised]]
  @scala.inline
  def createBrokerAsPromised(config: typingsSlinky.rascal.mod.BrokerConfig, components: js.Any): js.Promise[typingsSlinky.rascal.mod.BrokerAsPromised] = (typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.rascal.mod.BrokerAsPromised]]
  
  @scala.inline
  def withDefaultConfig(config: typingsSlinky.rascal.mod.BrokerConfig): typingsSlinky.rascal.mod.BrokerConfig = typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rascal.mod.BrokerConfig]
  
  @scala.inline
  def withTestConfig(config: typingsSlinky.rascal.mod.BrokerConfig): typingsSlinky.rascal.mod.BrokerConfig = typingsSlinky.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTestConfig")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rascal.mod.BrokerConfig]
}
