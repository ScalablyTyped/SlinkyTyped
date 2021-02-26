package typingsSlinky.opentracing

import typingsSlinky.opentracing.spanMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopMod {
  
  @JSImport("opentracing/lib/noop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("opentracing/lib/noop", "initialize")
  @js.native
  def initialize(): Unit = js.native
  
  @JSImport("opentracing/lib/noop", "span")
  @js.native
  def span: default | Null = js.native
  
  @JSImport("opentracing/lib/noop", "spanContext")
  @js.native
  def spanContext: typingsSlinky.opentracing.spanContextMod.default | Null = js.native
  @scala.inline
  def spanContext_=(x: typingsSlinky.opentracing.spanContextMod.default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spanContext")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def span_=(x: default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("span")(x.asInstanceOf[js.Any])
  
  @JSImport("opentracing/lib/noop", "tracer")
  @js.native
  def tracer: typingsSlinky.opentracing.tracerMod.default | Null = js.native
  @scala.inline
  def tracer_=(x: typingsSlinky.opentracing.tracerMod.default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tracer")(x.asInstanceOf[js.Any])
}
