organization := "org.scalablytyped.slinky"
name := "lumino__dragdrop"
version := "1.6.4-eb867b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-5516f9",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-0c65b7",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-ecfb0d",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-80eff1",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
