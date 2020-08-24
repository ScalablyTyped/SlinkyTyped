organization := "org.scalablytyped.slinky"
name := "activex-infopath"
version := "3.0-dt-20200515Z-76a3e4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20200515Z-f531da",
  "org.scalablytyped.slinky" %%% "activex-mshtml" % "4.0-dt-20200515Z-99022a",
  "org.scalablytyped.slinky" %%% "activex-msxml2" % "6.0-dt-20200515Z-8c60de",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200515Z-9d6097",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
