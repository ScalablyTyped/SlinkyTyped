organization := "org.scalablytyped.slinky"
name := "jqueryui"
version := "1.12-dt-20200515Z-5a426d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200515Z-84437f",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-46608e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
