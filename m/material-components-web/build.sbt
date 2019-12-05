organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-b0ff8b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20190213Z-58bc93",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-e0c699",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20191126Z-984781",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20191126Z-6fd756",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-2c48d5",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20191126Z-91281d",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20191126Z-a6a867",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-177fa2",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20191126Z-7c150f",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20191126Z-16d690",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-d61ee0",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-3f408e",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20191126Z-d15262",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20191126Z-bce078",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20191126Z-46de9d",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-6cd3cb",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-7b914e",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20191126Z-52d5c4",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-76b89d",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20191126Z-9bd51b",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-7b19ca",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20191126Z-efe2cb",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20191126Z-d48c3b",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-f36018",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20191126Z-a2b978",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-7dd5d8",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-86c7dd",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-8863a1",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20191126Z-6ed98f",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20191126Z-ad7c6b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        