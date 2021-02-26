package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Metadata
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorUtilsMod {
  
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = js.native
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any): Unit = js.native
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  @JSImport("inversify/dts/annotation/decorator_utils", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  
  @JSImport("inversify/dts/annotation/decorator_utils", "tagParameter")
  @js.native
  def tagParameter(annotationTarget: js.Any, propertyName: String, parameterIndex: Double, metadata: Metadata): Unit = js.native
  
  @JSImport("inversify/dts/annotation/decorator_utils", "tagProperty")
  @js.native
  def tagProperty(annotationTarget: js.Any, propertyName: String, metadata: Metadata): Unit = js.native
}
