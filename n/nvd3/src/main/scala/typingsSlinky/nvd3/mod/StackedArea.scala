package typingsSlinky.nvd3.mod

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Transition.mod.Transition_
import typingsSlinky.nvd3.nvd3Strings.`stream-center`
import typingsSlinky.nvd3.nvd3Strings.expand
import typingsSlinky.nvd3.nvd3Strings.silhouette
import typingsSlinky.nvd3.nvd3Strings.stack
import typingsSlinky.nvd3.nvd3Strings.stack_percent
import typingsSlinky.nvd3.nvd3Strings.stream
import typingsSlinky.nvd3.nvd3Strings.wiggle
import typingsSlinky.nvd3.nvd3Strings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedArea extends Scatter {
  
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(): js.Function2[/* d */ js.Any, /* i */ Double, Boolean] = js.native
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(func: js.Function2[/* d */ js.Any, /* i */ Double, Boolean]): this.type = js.native
  
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(): String = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(value: String): this.type = js.native
  
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def offset(offset: String): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def offset(offset: js.Function1[/* data */ js.Array[js.Tuple2[Double, Double]], js.Array[Double]]): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_expand(offset: expand): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_silhouette(offset: silhouette): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_wiggle(offset: wiggle): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("offset")
  def offset_zero(offset: zero): this.type = js.native
  
  def order(): String = js.native
  def order(value: String): this.type = js.native
  
  def scatter(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatter(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("scatter")
  var scatter_Original: Scatter = js.native
  
  def style(offset: String): this.type = js.native
  @JSName("style")
  def style_expand(offset: expand): this.type = js.native
  @JSName("style")
  def style_stack(offset: stack): this.type = js.native
  @JSName("style")
  def style_stackpercent(offset: stack_percent): this.type = js.native
  @JSName("style")
  def style_stream(offset: stream): this.type = js.native
  @JSName("style")
  def style_streamcenter(offset: `stream-center`): this.type = js.native
}
