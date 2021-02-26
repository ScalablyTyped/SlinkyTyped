package typingsSlinky.cookieclicker.Game

import org.scalajs.dom.raw.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Minigame extends StObject {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.native
  
  var effs: js.UndefOr[Effects] = js.native
  
  def init(div: HTMLDivElement): Unit = js.native
  
  /**
    * Ran on load, never after
    */
  def launch(): Unit = js.native
  
  def load(save: String): Unit = js.native
  
  var logic: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The name of the minigame
    */
  var name: String = js.native
  
  var onLevel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onResize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRuinTheFun: js.UndefOr[js.Function0[Unit]] = js.native
  
  var parent: GameObject = js.native
  
  /**
    * @returns The save string, can't contain `;` `|` or `,`, it's recommended to not use letters
    */
  def save(): String = js.native
}
object Minigame {
  
  @scala.inline
  def apply(
    init: HTMLDivElement => Unit,
    launch: () => Unit,
    load: String => Unit,
    name: String,
    parent: GameObject,
    save: () => String
  ): Minigame = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), launch = js.Any.fromFunction0(launch), load = js.Any.fromFunction1(load), name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[Minigame]
  }
  
  @scala.inline
  implicit class MinigameMutableBuilder[Self <: Minigame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    @scala.inline
    def setEffs(value: Effects): Self = StObject.set(x, "effs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffsUndefined: Self = StObject.set(x, "effs", js.undefined)
    
    @scala.inline
    def setInit(value: HTMLDivElement => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogic(value: () => Unit): Self = StObject.set(x, "logic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLevel(value: () => Unit): Self = StObject.set(x, "onLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLevelUndefined: Self = StObject.set(x, "onLevel", js.undefined)
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    @scala.inline
    def setOnRuinTheFun(value: () => Unit): Self = StObject.set(x, "onRuinTheFun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRuinTheFunUndefined: Self = StObject.set(x, "onRuinTheFun", js.undefined)
    
    @scala.inline
    def setParent(value: GameObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => String): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
