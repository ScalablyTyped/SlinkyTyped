package typingsSlinky.entriaRelayExperimental

import typingsSlinky.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typingsSlinky.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsSlinky.entriaRelayExperimental.useLoadMoreFunctionMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entriaRelayExperimentalStrings {
  
  @js.native
  sealed trait backward extends Direction
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait forward extends Direction
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait full extends RenderPolicy
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait `network-only` extends FetchPolicy
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @js.native
  sealed trait partial extends RenderPolicy
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait `store-and-network` extends FetchPolicy
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @js.native
  sealed trait `store-only` extends FetchPolicy
  @scala.inline
  def `store-only`: `store-only` = "store-only".asInstanceOf[`store-only`]
  
  @js.native
  sealed trait `store-or-network` extends FetchPolicy
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}
