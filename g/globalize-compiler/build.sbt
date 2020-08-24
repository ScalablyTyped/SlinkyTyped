organization := "org.scalablytyped.slinky"
name := "globalize-compiler"
version := "v0.2.0-dt-20200527Z-c3e106"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200515Z-bda433",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-09977c",
  "org.scalablytyped.slinky" %%% "globalize" % "1.5-dt-20200527Z-92bbf8",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
