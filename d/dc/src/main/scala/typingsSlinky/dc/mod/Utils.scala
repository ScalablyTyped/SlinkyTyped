package typingsSlinky.dc.mod

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  def add(l: js.Date, r: String): js.Date | Double = js.native
  def add(l: js.Date, r: String, t: String): js.Date | Double = js.native
  def add(l: js.Date, r: String, t: js.Function): js.Date | Double = js.native
  def add(l: js.Date, r: Double): js.Date | Double = js.native
  def add(l: js.Date, r: Double, t: String): js.Date | Double = js.native
  def add(l: js.Date, r: Double, t: js.Function): js.Date | Double = js.native
  def add(l: Double, r: String): js.Date | Double = js.native
  def add(l: Double, r: String, t: String): js.Date | Double = js.native
  def add(l: Double, r: String, t: js.Function): js.Date | Double = js.native
  def add(l: Double, r: Double): js.Date | Double = js.native
  def add(l: Double, r: Double, t: String): js.Date | Double = js.native
  def add(l: Double, r: Double, t: js.Function): js.Date | Double = js.native
  
  def appendOrSelect(
    parent: Selection_[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    selector: String,
    tag: String
  ): Selection_[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
  ] = js.native
  
  def arraysEqual(): Boolean = js.native
  def arraysEqual(a1: js.Array[_]): Boolean = js.native
  def arraysEqual(a1: js.Array[_], a2: js.Array[_]): Boolean = js.native
  def arraysEqual(a1: Null, a2: js.Array[_]): Boolean = js.native
  
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  
  def constant(x: js.Any): js.Function0[_] = js.native
  
  def isFloat(n: js.Any): Boolean = js.native
  
  def isInteger(n: js.Any): Boolean = js.native
  
  def isNegligible(n: js.Any): Boolean = js.native
  
  def isNumber(n: js.Any): Boolean = js.native
  
  def nameToId(name: String): String = js.native
  
  def printSingleValue(filter: js.Any): String = js.native
  
  def safeNumber(n: js.Any): Double = js.native
  
  def subtract(l: js.Date, r: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: String, t: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: String, t: js.Function): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double, t: String): js.Date | Double = js.native
  def subtract(l: js.Date, r: Double, t: js.Function): js.Date | Double = js.native
  def subtract(l: Double, r: String): js.Date | Double = js.native
  def subtract(l: Double, r: String, t: String): js.Date | Double = js.native
  def subtract(l: Double, r: String, t: js.Function): js.Date | Double = js.native
  def subtract(l: Double, r: Double): js.Date | Double = js.native
  def subtract(l: Double, r: Double, t: String): js.Date | Double = js.native
  def subtract(l: Double, r: Double, t: js.Function): js.Date | Double = js.native
  
  def uniqueId(): Double = js.native
}
