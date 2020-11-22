package typingsSlinky.keepNetworkTbtcJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keepNetworkTbtcJs.commonTypesMod.Contract
import typingsSlinky.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import typingsSlinky.keepNetworkTbtcJs.commonTypesMod.Web3
import typingsSlinky.keepNetworkTbtcJs.constantsMod.Constants
import typingsSlinky.keepNetworkTbtcJs.depositMod.DepositFactory
import typingsSlinky.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.Artifact
import typingsSlinky.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.ContractCall
import typingsSlinky.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.ContractCallOptions
import typingsSlinky.keepNetworkTbtcJs.tbtcMod.TBTC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getNetworkIdFromArtifact(): String = js.native
  
  @js.native
  object EthereumHelpers extends js.Object {
    
    @js.native
    object EthereumHelpers extends js.Object {
      
      def bytesToRaw(bytesString: String): String = js.native
      
      def getDeployedContract(artifact: Artifact, web3: Web3, networkId: String): Contract = js.native
      
      def getEvent(sourceContract: Contract, eventName: String): js.Promise[_] = js.native
      def getEvent(sourceContract: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
      
      def getExistingEvent(source: Contract, eventName: String): js.Promise[_] = js.native
      def getExistingEvent(source: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
      
      def isMainnet(web3: Web3): js.Promise[Boolean] = js.native
      
      def readEventFromTransaction(web3: Web3, transaction: js.Any, sourceContract: Contract, eventName: String): StringDictionary[String] = js.native
      
      def sendSafely(boundContractMethod: ContractCall): js.Promise[_] = js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: js.UndefOr[scala.Nothing], forceSend: Boolean): js.Promise[_] = js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions): js.Promise[_] = js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions, forceSend: Boolean): js.Promise[_] = js.native
      
      def sendSafelyRetryable(
        boundContractMethod: ContractCall,
        sendParams: ContractCallOptions,
        forceSend: Boolean,
        totalAttempts: Double
      ): js.Promise[_] = js.native
    }
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.keepNetworkTbtcJs.tbtcMod.default {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def withConfig(config: TBTCConfig): js.Promise[TBTC] = js.native
    def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = js.native
  }
}
